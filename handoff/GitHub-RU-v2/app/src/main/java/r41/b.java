package r41;

import java.util.ArrayList;
import p41.m;
import u5.i;
import w80.t;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public volatile Object a;
    public volatile Object b;
    public final Object c;

    public b(m mVar) {
        u41.b bVar = new u41.b();
        t tVar = new t(8);
        this.b = bVar;
        this.c = new ArrayList();
        this.a = tVar;
        mVar.a(new a(this));
    }

    public b(i iVar) {
        this.c = iVar;
    }
}
