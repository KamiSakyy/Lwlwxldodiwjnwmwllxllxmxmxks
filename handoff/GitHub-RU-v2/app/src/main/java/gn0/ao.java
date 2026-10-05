package gn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ao {
    public static bo a(String str) {
        Object obj;
        d71.b bVar = bo.D;
        bVar.getClass();
        a5.g1 g1Var = new a5.g1(8, bVar);
        while (true) {
            if (!g1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = g1Var.next();
            if (((bo) obj).r.equals(str)) {
                break;
            }
        }
        bo boVar = (bo) obj;
        return boVar == null ? bo.B : boVar;
    }
}
