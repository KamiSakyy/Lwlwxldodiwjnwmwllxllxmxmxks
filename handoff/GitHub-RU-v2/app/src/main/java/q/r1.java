package q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class r1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: r, reason: collision with root package name */
    public float f30699r;

    /* renamed from: s, reason: collision with root package name */
    public int f30700s;

    /* renamed from: t, reason: collision with root package name */
    public int f30701t;

    /* renamed from: u, reason: collision with root package name */
    public View f30702u;

    /* renamed from: v, reason: collision with root package name */
    public q1 f30703v;

    /* renamed from: w, reason: collision with root package name */
    public q1 f30704w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f30705x;

    /* renamed from: y, reason: collision with root package name */
    public int f30706y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f30707z = new int[2];

    public r1(View view) {
        this.f30702u = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f30699r = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f30700s = tapTimeout;
        this.f30701t = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        q1 q1Var = this.f30704w;
        View view = this.f30702u;
        if (q1Var != null) {
            view.removeCallbacks(q1Var);
        }
        q1 q1Var2 = this.f30703v;
        if (q1Var2 != null) {
            view.removeCallbacks(q1Var2);
        }
    }

    public abstract p.b0 b();

    public abstract boolean c();

    public boolean d() {
        p.b0 b10 = b();
        if (b10 == null || !b10.a()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        o1 h10;
        boolean z11 = this.f30705x;
        View view2 = this.f30702u;
        if (z11) {
            p.b0 b10 = b();
            if (b10 != null && b10.a() && (h10 = b10.h()) != null && h10.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f30707z;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                h10.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b11 = h10.b(obtainNoHistory, this.f30706y);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z12 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b11) {
                }
            }
            if (d()) {
                z10 = false;
            }
            z10 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f30706y);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y2 = motionEvent.getY(findPointerIndex);
                                float f6 = this.f30699r;
                                float f10 = -f6;
                                if (x2 < f10 || y2 < f10 || x2 >= (view2.getRight() - view2.getLeft()) + f6 || y2 >= (view2.getBottom() - view2.getTop()) + f6) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z10 = true;
                                        if (z10) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.f30706y = motionEvent.getPointerId(0);
                    if (this.f30703v == null) {
                        this.f30703v = new q1(this, 0);
                    }
                    view2.postDelayed(this.f30703v, this.f30700s);
                    if (this.f30704w == null) {
                        this.f30704w = new q1(this, 1);
                    }
                    view2.postDelayed(this.f30704w, this.f30701t);
                }
            }
            z10 = false;
            if (z10) {
            }
        }
        this.f30705x = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f30705x = false;
        this.f30706y = -1;
        q1 q1Var = this.f30703v;
        if (q1Var != null) {
            this.f30702u.removeCallbacks(q1Var);
        }
    }
}
