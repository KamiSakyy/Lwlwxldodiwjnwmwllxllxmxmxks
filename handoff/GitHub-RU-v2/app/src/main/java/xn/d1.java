package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 {
    public static e1 a(String str) {
        Object obj;
        k71.k.g(str, "rawValue");
        d71.b bVar = e1.B;
        bVar.getClass();
        a5.g1 g1Var = new a5.g1(8, bVar);
        while (true) {
            if (!g1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = g1Var.next();
            if (((e1) obj).r.equals(str)) {
                break;
            }
        }
        e1 e1Var = (e1) obj;
        return e1Var == null ? e1.z : e1Var;
    }
}
