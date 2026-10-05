package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y00 {
    public static z00 a(String str) {
        Object obj;
        d71.b bVar = z00.D;
        bVar.getClass();
        a5.g1 g1Var = new a5.g1(8, bVar);
        while (true) {
            if (!g1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = g1Var.next();
            if (((z00) obj).r.equals(str)) {
                break;
            }
        }
        z00 z00Var = (z00) obj;
        return z00Var == null ? z00.B : z00Var;
    }
}
