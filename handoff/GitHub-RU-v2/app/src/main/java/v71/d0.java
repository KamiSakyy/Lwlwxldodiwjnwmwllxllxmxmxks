package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class d0 {
    public static final g0 a;

    static {
        String str;
        a71.e eVar;
        int i = a81.u.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            c81.e eVar2 = l0.a;
            w71.d dVar = a81.n.a;
            w71.d dVar2 = dVar.w;
            eVar = dVar;
            if (dVar == null) {
                eVar = c0.A;
            }
        } else {
            eVar = c0.A;
        }
        a = eVar;
    }
}
