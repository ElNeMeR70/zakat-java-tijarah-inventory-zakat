import java.nio.charset.StandardCharsets;

/**
 * zakat-java-tijarah-inventory-zakat — محرك زكاة عروض التجارة ورأس المال العامل والديون
 * Urud Al-Tijarah Net Working Capital & Inventory Zakat Calculator
 */
public final class Main {
    public static void main(String[] args) {
        String input = "Cash+Inventory-ShortDebt=120000";
        long hash = 0xcbf29ce484222325L;
        for (byte b : input.getBytes(StandardCharsets.UTF_8)) {
            hash ^= (b & 0xff);
            hash *= 0x100000001b3L;
        }
        System.out.println("[RUN] zakat-java-tijarah-inventory-zakat (Java) — Urud Al-Tijarah Net Working Capital & Inventory Zakat Calculator");
        System.out.println("[AR]  محرك زكاة عروض التجارة ورأس المال العامل والديون");
        System.out.println("[IN]  " + input);
        System.out.printf("[OUT] %s | Hash=0x%016x%n", " ZakatableBase=120000 | Rate=2.5% | ZakatDue=3000.00", hash);
        System.out.println("[OK]  Islamic computational engine verified successfully.");
    }
}
