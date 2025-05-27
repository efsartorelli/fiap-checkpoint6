package br.com.fiap.winery;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;

public class ApplicationClient2 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8085/WineStockService?wsdl");
        QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
        Service service = Service.create(url, qName);
        WineStockService wineStockService = service.getPort(WineStockService.class);

        String order = wineStockService.placeOrder("Carlos", 2);
        System.out.println("Resposta do pedido:\n" + order);

        URL url2 = new URL("http://localhost:8086/WineWarningService?wsdl");
        QName qName2 = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");
        Service service2 = Service.create(url2, qName2);
        WineWarningService warningService = service2.getPort(WineWarningService.class);
        String warn = warningService.sendWarn();
        System.out.println("Aviso recebido:\n" + warn);
    }
}
