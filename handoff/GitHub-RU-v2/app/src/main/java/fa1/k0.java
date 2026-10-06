package fa1;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class k0 {
    public static final a a;
    public static final bShadow b;
    public static final bShadow c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        int i = 6;
        if (property.equals("RoboVM")) {
            a = null;
            b = new bShadow(7);
            c = new bShadow(i);
        } else if (property.equals("Dalvik")) {
            a = new a(0);
            b = new l0(0);
            c = new d(i);
        } else {
            a = null;
            b = new l0(1);
            c = new d(i);
        }
    }
}
