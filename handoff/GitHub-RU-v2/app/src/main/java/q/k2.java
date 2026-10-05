package q;

import androidx.appcompat.widget.SearchView;

/* loaded from: /home/user/work/p/classes.dex */
public final class k2 implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f30639r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SearchView f30640s;

    public /* synthetic */ k2(SearchView searchView, int i) {
        this.f30639r = i;
        this.f30640s = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30639r) {
            case k5.f.J:
                this.f30640s.t();
                break;
            default:
                g5.a aVar = this.f30640s.f985j0;
                if (aVar instanceof t2) {
                    aVar.b(null);
                    break;
                }
                break;
        }
    }
}
