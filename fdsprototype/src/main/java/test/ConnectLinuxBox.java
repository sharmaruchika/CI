package test;

import java.io.File;
import java.io.InputStream;
import org.mule.api.MuleEventContext;

import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

import com.jcraft.jsch.*;

import test.MyUserInfo;



public class ConnectLinuxBox implements Callable{ 

		@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		
			//System.out.println(eventContext.getMessage());
			
			
			 String ARCHIVE_DIR = eventContext.getMessage().getProperty("ARCHIVE_DIR", PropertyScope.SESSION);
			 String ARCHIVE_ENABLE = eventContext.getMessage().getProperty("ARCHIVE_ENABLE", PropertyScope.SESSION);
			 String ARCHIVE_FILENAME = eventContext.getMessage().getProperty("ARCHIVE_FILENAME", PropertyScope.SESSION);
			 String Source = eventContext.getMessage().getProperty("Source", PropertyScope.SESSION);
			 String target = eventContext.getMessage().getProperty("target", PropertyScope.SESSION);
			String fileName= eventContext.getMessage().getProperty("fileName", PropertyScope.SESSION);
			String FTP_HOST= eventContext.getMessage().getProperty("FTP_HOST", PropertyScope.SESSION);
			
			System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
			
			String port; //= (java.lang.Integer)(eventContext.getMessage().getProperty("FTP_PORT", PropertyScope.SESSION));
			port = eventContext.getMessage().getProperty("FTP_PORT", PropertyScope.SESSION);
			
			int FTP_PORT = Integer.parseInt(port);
			
			System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
			
			String USERNAME= eventContext.getMessage().getProperty("USERNAME", PropertyScope.SESSION);
			String PASSWORD= eventContext.getMessage().getProperty("PASSWORD", PropertyScope.SESSION);
			
			
			
			JSch jsch=new JSch();
			
			Session session=jsch.getSession(USERNAME, FTP_HOST, FTP_PORT);
		
			UserInfo ui=new MyUserInfo();
			
			ui.promptPassword(PASSWORD);
            session.setUserInfo(ui);
			
			System.out.println("FFFFFFFFFFF"+USERNAME+"FFFFFFFF"+FTP_PORT+"FFFFFFFFFFFF"+FTP_HOST+"FFFFFFFFFFFF"+PASSWORD+"FFFFFFFFFF");
			session.setPassword(PASSWORD);
			
			
			java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
			
			System.out.println("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");

            
            
            String TestCommand="mv"+" "+Source+"/"+fileName+" "+ARCHIVE_DIR+"/"+ARCHIVE_FILENAME;
           // String TestCommand="whoami,pwd";
            
            String[] parts = TestCommand.split(",");
            
           // String command=  "ls,whoami";
            
            
            
            
            
            
            for(int j=0;j<1;j++){
            	Channel channel=session.openChannel("exec");
            String command=  parts[j];
            ((ChannelExec)channel).setCommand(command);
      
            
            channel.setInputStream(null);
      
            ((ChannelExec)channel).setErrStream(System.err);
      
            InputStream in=channel.getInputStream();
			
			System.out.println("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
      
            channel.connect();
			
			System.out.println("GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG");
      
            byte[] tmp=new byte[1024];
            while(true){
              while(in.available()>0){
                int i=in.read(tmp, 0, 1024);
                if(i<0)break;
                System.out.print(new String(tmp, 0, i));
              }
              ChannelSftp sftp = (ChannelSftp)channel;
              File f = new File("c:/xyz.txt");
              
              if(channel.isClosed()){
                System.out.println("exit-status: "+channel.getExitStatus());
                break;
              }
              try{Thread.sleep(1000);}catch(Exception ee){}
            }
            
            
            
            channel.disconnect();
            
            
            }
            
            
            
            session.disconnect();   
			
	
      		

		      return "Done";
	}

}


