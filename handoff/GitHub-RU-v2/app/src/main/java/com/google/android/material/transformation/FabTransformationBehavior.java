package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import l4.e;

@Deprecated
/* loaded from: /home/user/work/p/classes4.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public final boolean f(View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public final void g(e eVar) {
        if (eVar.h == 0) {
            eVar.h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e<T1,T2,T3,T4> {
        public e() {
        }
    }
}
