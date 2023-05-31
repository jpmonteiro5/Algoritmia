public class Logger {
    private static Logger instance;
    private String logString;
    private Logger(String logString) {
        this.logString = logString;
    }
    public static synchronized Logger getInstance(String logString) {
        if (instance == null) {
            instance = new Logger(logString);
        }
        return instance;
    }
    public void connect() {
        // Código para conectar à base de dados usando a connectionString
        System.out.println("Conectado à base de dados: " + logString);
    }
    public void disconnect() {
        // Código para desconectar da base de dados
        System.out.println("Desconectado da base de dados: " + logString);
    }
    // Outros métodos da classe
}
