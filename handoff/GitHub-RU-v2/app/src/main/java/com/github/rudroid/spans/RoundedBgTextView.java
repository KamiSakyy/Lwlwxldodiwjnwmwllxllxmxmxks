package com.github.rudroid.spans;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import k71.k;
import kh.a;
import lg.g;
import lg.j;
import sy.w;
import w61.p;

/* loaded from: /home/user/work/p/classes3.dex */
public final class RoundedBgTextView extends AppCompatTextView {
    public static final /* synthetic */ int B = 0;
    public final p A;
    public g[] y;
    public final p z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedBgTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        k.g(context, "context");
        this.z = w.t(new a(15));
        this.A = w.t(new a(16));
    }

    private final j getMultiLineRenderer() {
        return (j) this.A.getValue();
    }

    private final j getSingleLineRenderer() {
        return (j) this.z.getValue();
    }

    public final void g(Canvas canvas, Spanned spanned, Layout layout) {
        Layout layout2 = layout;
        g[] gVarArr = this.y;
        if (gVarArr == null) {
            gVarArr = (g[]) spanned.getSpans(0, spanned.length(), g.class);
            this.y = gVarArr;
        }
        g[] gVarArr2 = gVarArr;
        if (gVarArr2 != null) {
            int length = gVarArr2.length;
            int i = 0;
            while (i < length) {
                g gVar = gVarArr2[i];
                int spanStart = spanned.getSpanStart(gVar);
                int spanEnd = spanned.getSpanEnd(gVar);
                int lineForOffset = layout2.getLineForOffset(spanStart);
                int lineForOffset2 = layout2.getLineForOffset(spanEnd);
                (lineForOffset == lineForOffset2 ? getSingleLineRenderer() : getMultiLineRenderer()).a(canvas, layout2, lineForOffset, lineForOffset2, (int) layout2.getPrimaryHorizontal(spanStart), (int) layout2.getPrimaryHorizontal(spanEnd), gVar.h(), gVar.j(), gVar.o(), gVar.c());
                i++;
                layout2 = layout;
            }
        }
    }

    public final void onDetachedFromWindow() {
        this.y = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDraw(Canvas canvas) {
        k.g(canvas, "canvas");
        if ((getText() instanceof Spanned) && getLayout() != null) {
            float totalPaddingLeft = getTotalPaddingLeft();
            float totalPaddingTop = getTotalPaddingTop();
            int save = canvas.save();
            canvas.translate(totalPaddingLeft, totalPaddingTop);
            try {
                CharSequence text = getText();
                k.e(text, "null cannot be cast to non-null type android.text.Spanned");
                Layout layout = getLayout();
                k.f(layout, "getLayout(...)");
                g(canvas, (Spanned) text, layout);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        super/*android.view.View*/.onDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.y = null;
        super/*android.widget.TextView*/.setText(charSequence, bufferType);
    }
}
