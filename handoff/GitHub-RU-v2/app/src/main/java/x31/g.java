package x31;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public Object a;
    public CharSequence b;
    public int c;
    public View d;
    public TabLayout e;
    public j f;

    public final void a() {
        TabLayout tabLayout = this.e;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.k(this, true);
    }

    public final void b(CharSequence charSequence) {
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(charSequence)) {
            this.f.setContentDescription(charSequence);
        }
        this.b = charSequence;
        j jVar = this.f;
        if (jVar != null) {
            jVar.d();
        }
    }
}
