package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bv {
    public static cv a(String str) {
        Object obj;
        d71.b bVar = cv.D;
        bVar.getClass();
        a5.g1 g1Var = new a5.g1(8, bVar);
        while (true) {
            if (!g1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = g1Var.next();
            if (((cv) obj).r.equals(str)) {
                break;
            }
        }
        cv cvVar = (cv) obj;
        return cvVar == null ? cv.B : cvVar;
    }
}
