package j8;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: /home/user/work/p/classes.dex */
public final class m extends RecyclerView {

    /* renamed from: c1, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f27291c1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ViewPager2 viewPager2, Context context) {
        super(context, null);
        this.f27291c1 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f27291c1.K.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.f27291c1;
        accessibilityEvent.setFromIndex(viewPager2.f3201u);
        accessibilityEvent.setToIndex(viewPager2.f3201u);
        accessibilityEvent.setSource((ViewPager2) viewPager2.K.v);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f27291c1.I && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f27291c1.I && super.onTouchEvent(motionEvent);
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ViewPager2 {
        public ViewPager2() {
        }
    }
}
