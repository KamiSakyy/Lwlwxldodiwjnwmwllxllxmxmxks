package q3;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import f2.e;
import f2.g;
import f2.h;
import k71.k;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* renamed from: r, reason: collision with root package name */
    public e f30923r;

    public a(e eVar) {
        this.f30923r = eVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            g gVar = g.f24213a;
            e eVar = this.f30923r;
            if (k.b(eVar, gVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(eVar instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            h hVar = (h) eVar;
            textPaint.setStrokeWidth(hVar.f24214a);
            textPaint.setStrokeMiter(hVar.f24215b);
            int i = hVar.f24217d;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i10 = hVar.f24216c;
            textPaint.setStrokeCap(i10 == 0 ? Paint.Cap.BUTT : i10 == 1 ? Paint.Cap.ROUND : i10 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
