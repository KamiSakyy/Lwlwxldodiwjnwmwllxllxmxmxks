package kotlin.io;

import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements s71.h {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ k(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [c71.i, j71.e] */
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new j(this);
            case 1:
                return i21.a.z((c71.i) this.b);
            case 2:
                return (Iterator) this.b;
            case 3:
                return new t71.i((CharSequence) this.b);
            default:
                return ((Iterable) this.b).iterator();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(j71.e eVar) {
        this.a = 1;
        this.b = (c71.i) eVar;
    }
}
