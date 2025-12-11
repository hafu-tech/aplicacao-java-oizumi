package school.sptech;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogSistema extends Log {

    public LogSistema(String data, String descricao, Integer qtdRegistros, Integer fkStatus) {
        super( data, descricao, qtdRegistros, fkStatus);
    }

}
