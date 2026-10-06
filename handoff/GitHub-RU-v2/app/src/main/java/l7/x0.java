package l7;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: /home/user/work/p/classes.dex */
public class x0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public n1 f28350a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f28351b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28352c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28353d;

    public x0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28351b = new Rect();
        this.f28352c = true;
        this.f28353d = false;
    }

    public x0(int i, int i10) {
        super(i, i10);
        this.f28351b = new Rect();
        this.f28352c = true;
        this.f28353d = false;
    }

    public x0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f28351b = new Rect();
        this.f28352c = true;
        this.f28353d = false;
    }

    public x0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f28351b = new Rect();
        this.f28352c = true;
        this.f28353d = false;
    }

    public x0(x0 x0Var) {
        super((ViewGroup.LayoutParams) x0Var);
        this.f28351b = new Rect();
        this.f28352c = true;
        this.f28353d = false;
    }
}
