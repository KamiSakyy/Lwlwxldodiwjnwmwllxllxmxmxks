package s71;

import a5.j0;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31746a;

    /* renamed from: b, reason: collision with root package name */
    public final h f31747b;

    /* renamed from: c, reason: collision with root package name */
    public final j71.c f31748c;

    public /* synthetic */ l(h hVar, j71.c cVar, int i) {
        this.f31746a = i;
        this.f31747b = hVar;
        this.f31748c = cVar;
    }

    @Override // s71.h
    public final Iterator iterator() {
        switch (this.f31746a) {
            case k5.f.J:
                return new f(this);
            default:
                return new j0(this);
        }
    }
}
