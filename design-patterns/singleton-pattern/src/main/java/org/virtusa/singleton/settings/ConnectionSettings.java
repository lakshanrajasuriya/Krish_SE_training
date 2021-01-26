package org.virtusa.singleton.settings;

public class ConnectionSettings {
    private static volatile ConnectionSettings connectionSettings;
    private static volatile String url;
    private static volatile String userName;
    private static volatile String password;

    public ConnectionSettings() {
        if(connectionSettings !=null){
            throw new RuntimeException("Please use getConnectionSettings method");
        }
    }

    public static ConnectionSettings getConnectionSettings(){
        if(connectionSettings ==null){
            synchronized (ConnectionSettings.class){
                if(connectionSettings ==null){
                    connectionSettings =new ConnectionSettings();
                }
            }
        }
        return connectionSettings;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ConnectionSettings{url="+this.getUrl()+",username="+this.getUserName()+"}";
    }
}
