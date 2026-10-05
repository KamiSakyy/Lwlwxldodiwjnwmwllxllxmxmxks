package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import l7.e0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r extends e0 {
    public final /* synthetic */ int p = 0;

    public /* synthetic */ r(Context context) {
        super(context);
    }

    public int b(View view, int i) {
        switch (this.p) {
            case 1:
                return 0;
            default:
                return super.b(view, i);
        }
    }

    public int c(View view, int i) {
        switch (this.p) {
            case 1:
                return 0;
            default:
                return super.c(view, i);
        }
    }

    public float d(DisplayMetrics displayMetrics) {
        switch (this.p) {
            case 0:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    public PointF f(int i) {
        switch (this.p) {
            case 1:
                return null;
            default:
                return super.f(i);
        }
    }

    public r(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
