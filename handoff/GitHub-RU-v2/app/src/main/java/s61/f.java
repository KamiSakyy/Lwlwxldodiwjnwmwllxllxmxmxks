package s61;

import android.view.GestureDetector;
import android.view.MotionEvent;
import es.voghdev.pdfviewpager.library.subscaleview.SubsamplingScaleImageView;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ SubsamplingScaleImageView a;

    public f(SubsamplingScaleImageView subsamplingScaleImageView) {
        this.a = subsamplingScaleImageView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.a.performClick();
        return true;
    }
}
