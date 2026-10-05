package hc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ym {
    public static zm a(String str) {
        Object obj;
        d71.b bVar = zm.D;
        bVar.getClass();
        a5.g1 g1Var = new a5.g1(8, bVar);
        while (true) {
            if (!g1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = g1Var.next();
            if (((zm) obj).r.equals(str)) {
                break;
            }
        }
        zm zmVar = (zm) obj;
        return zmVar == null ? zm.B : zmVar;
    }
}
