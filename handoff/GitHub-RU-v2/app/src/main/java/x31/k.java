package x31;

import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements d {
    public final /* synthetic */ int r;
    public ViewGroup s;

    public /* synthetic */ k(ViewGroup viewGroup, int i) {
        this.r = i;
        this.s = viewGroup;
    }

    private final void a(g gVar) {
    }

    private final void b(g gVar) {
    }

    private final void c(g gVar) {
    }

    private final void d(g gVar) {
    }

    @Override // x31.c
    public final void C0(g gVar) {
        int i = this.r;
    }

    @Override // x31.c
    public final void d3(g gVar) {
        int i = this.r;
    }

    @Override // x31.c
    public final void j0(g gVar) {
        switch (this.r) {
            case 0:
                this.s.setCurrentItem(gVar.c);
                break;
            default:
                ViewPager2 viewPager2 = this.s;
                int i = gVar.c;
                Object obj = viewPager2.E.s;
                viewPager2.b(i);
                break;
        }
    }
    public Object getAdapter() { return null; }
    public Object getCurrentItem() { return null; }
    public Object l0 = null;
    public Object n0 = null;
    public k(Object p1, int p2) {
    }
}
