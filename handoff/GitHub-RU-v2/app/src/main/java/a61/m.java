package a61;

import android.content.Context;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements d61.b {
    public final /* synthetic */ int a;
    public final v61.a b;

    public /* synthetic */ m(v61.a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // v61.a
    public final Object get() {
        int i = this.a;
        v61.a aVar = this.b;
        switch (i) {
            case 0:
                return new l((p51.b) ((d61.c) aVar).a);
            case 1:
                k41.g gVar = (k41.g) ((d61.c) aVar).a;
                k71.k.g(gVar, "firebaseApp");
                s0 s0Var = s0.a;
                return s0.a(gVar);
            case 2:
                Context context = (Context) ((d61.c) aVar).a;
                k71.k.g(context, "appContext");
                return s5.d.d(new a2.j(q.t), (List) null, new r(context, 0), 6);
            case 3:
                Context context2 = (Context) ((d61.c) aVar).a;
                k71.k.g(context2, "appContext");
                return s5.d.d(new a2.j(q.u), (List) null, new r(context2, 1), 6);
            case 4:
                return new e1((Context) ((d61.c) aVar).a);
            case 5:
                return new e61.a((Context) ((d61.c) aVar).a);
            default:
                return new e61.i((n5.f) aVar.get());
        }
    }

    public m(Object... a) {
    }
    public Object p() { return null; }
    public Object r() { return null; }
    public Object y() { return null; }
}
