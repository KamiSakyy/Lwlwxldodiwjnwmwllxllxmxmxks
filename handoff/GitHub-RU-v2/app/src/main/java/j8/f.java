package j8;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: /home/user/work/p/classes.dex */
public final class f extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f27287b;

    public /* synthetic */ f(ViewPager2 viewPager2, int i) {
        this.f27286a = i;
        this.f27287b = viewPager2;
    }

    @Override // j8.i
    public void a(int i) {
        switch (this.f27286a) {
            case k5.f.J:
                if (i == 0) {
                    this.f27287b.c();
                    break;
                }
                break;
        }
    }

    @Override // j8.i
    public final void c(int i) {
        switch (this.f27286a) {
            case k5.f.J:
                ViewPager2 viewPager2_r7 = this.f27287b;
                if (viewPager2_r7.f3201u != i) {
                    viewPager2_r7.f3201u = i;
                    viewPager2_r7.K.T();
                    break;
                }
                break;
            default:
                ViewPager2 viewPager22_r7 = this.f27287b;
                viewPager22_r7.clearFocus();
                if (viewPager22_r7.hasFocus()) {
                    viewPager22_r7.A.requestFocus(2);
                    break;
                }
                break;
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ViewPager2 {
        public ViewPager2() {
        }
    }
    public static final Object J = null;
}
