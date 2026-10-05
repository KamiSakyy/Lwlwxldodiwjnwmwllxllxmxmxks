package fa1;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class k0 {
    public static final a a;
    public static final b b;
    public static final b c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        int i = 6;
        if (property.equals("RoboVM")) {
            a = null;
            b = new b(7);
            c = new b(i);
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
