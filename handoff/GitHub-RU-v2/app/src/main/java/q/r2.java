package q;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: /home/user/work/p/classes.dex */
public final class r2 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f30708a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f30709b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f30710c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f30711d;

    /* renamed from: e, reason: collision with root package name */
    public final int f30712e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30713f;

    public r2(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f30712e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f30709b = rect3;
        Rect rect4 = new Rect();
        this.f30711d = rect4;
        Rect rect5 = new Rect();
        this.f30710c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.f30708a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int x2 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z12 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z11 = this.f30713f;
                if (z11 && !this.f30711d.contains(x2, y2)) {
                    z12 = z11;
                    z10 = false;
                }
            } else {
                if (action == 3) {
                    z11 = this.f30713f;
                    this.f30713f = false;
                }
                z10 = true;
                z12 = false;
            }
            z12 = z11;
            z10 = true;
        } else {
            if (this.f30709b.contains(x2, y2)) {
                this.f30713f = true;
                z10 = true;
            }
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f30710c;
        View view = this.f30708a;
        if (!z10 || rect.contains(x2, y2)) {
            motionEvent.setLocation(x2 - rect.left, y2 - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
