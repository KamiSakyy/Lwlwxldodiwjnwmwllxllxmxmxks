package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import j4.d;

/* loaded from: /home/user/work/p/classes.dex */
public class Guideline extends View {

    /* renamed from: r, reason: collision with root package name */
    public boolean f2210r;

    public Guideline(Context context) {
        super(context);
        this.f2210r = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f2210r = z10;
    }

    public void setGuidelineBegin(int i) {
        d dVar = (d) getLayoutParams();
        if (this.f2210r && dVar.f27019a == i) {
            return;
        }
        dVar.f27019a = i;
        setLayoutParams(dVar);
    }

    public void setGuidelineEnd(int i) {
        d dVar = (d) getLayoutParams();
        if (this.f2210r && dVar.f27021b == i) {
            return;
        }
        dVar.f27021b = i;
        setLayoutParams(dVar);
    }

    public void setGuidelinePercent(float f6) {
        d dVar = (d) getLayoutParams();
        if (this.f2210r && dVar.f27023c == f6) {
            return;
        }
        dVar.f27023c = f6;
        setLayoutParams(dVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2210r = true;
        super.setVisibility(8);
    }
}
