package p41;

import androidx.compose.foundation.lazy.layout.q1;
import m11.r;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements p51.b {
    public static final r c;
    public static final e d;
    public p51.a a;
    public volatile p51.b b;

    static {
        int i = 1;
        c = new r(i);
        d = new e(i);
    }

    public m(r rVar, p51.b bVar) {
        this.a = rVar;
        this.b = bVar;
    }

    public final void a(p51.a aVar) {
        p51.b bVar;
        p51.b bVar2;
        p51.b bVar3 = this.b;
        e eVar = d;
        if (bVar3 != eVar) {
            aVar.k(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.b;
            if (bVar != eVar) {
                bVar2 = bVar;
            } else {
                this.a = new q1(8, this.a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.k(bVar);
        }
    }

    @Override // p51.b
    public final Object get() {
        return this.b.get();
    }
}
