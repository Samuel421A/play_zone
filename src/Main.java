import music.ConsumoAPI;

import java.io.IOException;

public class Main {
    static void main() throws IOException, InterruptedException {
        ConsumoAPI api = new ConsumoAPI();
        api.request();
    }
}