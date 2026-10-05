package s61;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ SubsamplingScaleImageView b;

    public e(SubsamplingScaleImageView subsamplingScaleImageView, Context context) {
        this.b = subsamplingScaleImageView;
        this.a = context;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.b;
        if (!subsamplingScaleImageView.H || !subsamplingScaleImageView.t0 || subsamplingScaleImageView.O == null) {
            return onDoubleTapEvent(motionEvent);
        }
        subsamplingScaleImageView.setGestureDetector(this.a);
        PointF pointF = null;
        if (!subsamplingScaleImageView.I) {
            PointF pointF2 = new PointF(motionEvent.getX(), motionEvent.getY());
            float f = pointF2.x;
            float f2 = pointF2.y;
            PointF pointF3 = new PointF();
            PointF pointF4 = subsamplingScaleImageView.O;
            if (pointF4 != null) {
                float f3 = f - pointF4.x;
                float f4 = subsamplingScaleImageView.M;
                pointF3.set(f3 / f4, (f2 - pointF4.y) / f4);
                pointF = pointF3;
            }
            subsamplingScaleImageView.i(pointF, new PointF(motionEvent.getX(), motionEvent.getY()));
            return true;
        }
        subsamplingScaleImageView.k0 = new PointF(motionEvent.getX(), motionEvent.getY());
        PointF pointF5 = subsamplingScaleImageView.O;
        subsamplingScaleImageView.P = new PointF(pointF5.x, pointF5.y);
        subsamplingScaleImageView.N = subsamplingScaleImageView.M;
        subsamplingScaleImageView.c0 = true;
        subsamplingScaleImageView.a0 = true;
        subsamplingScaleImageView.n0 = -1.0f;
        PointF pointF6 = subsamplingScaleImageView.k0;
        float f5 = pointF6.x;
        float f6 = pointF6.y;
        PointF pointF7 = new PointF();
        PointF pointF8 = subsamplingScaleImageView.O;
        if (pointF8 != null) {
            float f7 = f5 - pointF8.x;
            float f8 = subsamplingScaleImageView.M;
            pointF7.set(f7 / f8, (f6 - pointF8.y) / f8);
            pointF = pointF7;
        }
        subsamplingScaleImageView.q0 = pointF;
        subsamplingScaleImageView.r0 = new PointF(motionEvent.getX(), motionEvent.getY());
        PointF pointF9 = subsamplingScaleImageView.q0;
        subsamplingScaleImageView.p0 = new PointF(pointF9.x, pointF9.y);
        subsamplingScaleImageView.o0 = false;
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.b;
        if (!subsamplingScaleImageView.G || !subsamplingScaleImageView.t0 || subsamplingScaleImageView.O == null || motionEvent == null || motionEvent2 == null || ((Math.abs(motionEvent.getX() - motionEvent2.getX()) <= 50.0f && Math.abs(motionEvent.getY() - motionEvent2.getY()) <= 50.0f) || ((Math.abs(f) <= 500.0f && Math.abs(f2) <= 500.0f) || subsamplingScaleImageView.a0))) {
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
        PointF pointF = subsamplingScaleImageView.O;
        PointF pointF2 = new PointF((f * 0.25f) + pointF.x, (f2 * 0.25f) + pointF.y);
        h hVar = new h(subsamplingScaleImageView, new PointF(((subsamplingScaleImageView.getWidth() / 2) - pointF2.x) / subsamplingScaleImageView.M, ((subsamplingScaleImageView.getHeight() / 2) - pointF2.y) / subsamplingScaleImageView.M));
        if (!n.c.contains(1)) {
            throw new IllegalArgumentException("Unknown easing type: 1");
        }
        hVar.e = 1;
        hVar.h = false;
        hVar.f = 3;
        hVar.a();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.b.performClick();
        return true;
    }
}
