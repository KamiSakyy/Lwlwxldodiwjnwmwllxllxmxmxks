package ba1;

import java.util.function.BinaryOperator;

/* loaded from: /home/user/work/p/classes5.dex */
public final /* synthetic */ class e implements BinaryOperator {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        g gVar = (g) obj;
        g gVar2 = (g) obj2;
        String k = h.k(gVar2.a);
        gVar2.a = null;
        aa1.b.K(gVar.a);
        gVar.a.append((Object) k);
        return gVar;
    }
}
