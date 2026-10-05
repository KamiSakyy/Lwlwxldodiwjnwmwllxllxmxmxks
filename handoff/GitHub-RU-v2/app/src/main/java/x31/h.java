package x31;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements androidx.viewpager.widget.g {
    public final WeakReference a;
    public int b;
    public int c;

    public h(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    public final void a(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            tabLayout.o0 = this.c;
        }
    }

    public final void b(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i2 = this.c;
        tabLayout.k(tabLayout.g(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }

    public final void c(int i, float f) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i2 = this.c;
            boolean z2 = true;
            if (i2 != 2 || this.b == 1) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            if (i2 == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.m(i, f, z2, z, false);
        }
    }
}
