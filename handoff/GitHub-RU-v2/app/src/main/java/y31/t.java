package y31;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t extends LinearLayout {
    public boolean A;
    public final TextInputLayout r;
    public final AppCompatTextView s;
    public CharSequence t;
    public final CheckableImageButton u;
    public ColorStateList v;
    public PorterDuff.Mode w;
    public int x;
    public ImageView.ScaleType y;
    public View.OnLongClickListener z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, android.widget.ImageView, com.google.android.material.internal.CheckableImageButton] */
    public t(TextInputLayout textInputLayout, l51.h hVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.r = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) ((CheckableImageButton) LayoutInflater.from(getContext()).inflate(2131558774, (ViewGroup) this, false));
        this.u = r1;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
        this.s = appCompatTextView;
        if (i4.d0(getContext())) {
            ((ViewGroup.MarginLayoutParams) r1.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.z;
        r1.setOnClickListener(null);
        sy.n.A((CheckableImageButton) r1, onLongClickListener);
        this.z = null;
        r1.setOnLongClickListener(null);
        sy.n.A((CheckableImageButton) r1, (View.OnLongClickListener) null);
        TypedArray typedArray = (TypedArray) hVar.t;
        if (typedArray.hasValue(70)) {
            this.v = i4.X(getContext(), hVar, 70);
        }
        if (typedArray.hasValue(71)) {
            this.w = o31.o.g(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            b(hVar.s(67));
            if (typedArray.hasValue(66) && r1.getContentDescription() != (text = typedArray.getText(66))) {
                r1.setContentDescription(text);
            }
            r1.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(2131166185));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.x) {
            this.x = dimensionPixelSize;
            r1.setMinimumWidth(dimensionPixelSize);
            r1.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType h = sy.n.h(typedArray.getInt(69, -1));
            this.y = h;
            r1.setScaleType(h);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(2131363429);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            appCompatTextView.setTextColor(hVar.q(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.t = TextUtils.isEmpty(text2) ? null : text2;
        appCompatTextView.setText(text2);
        e();
        addView(r1);
        addView(appCompatTextView);
    }

    public final int a() {
        int i;
        q.u uVar = this.u;
        if (uVar.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) uVar.getLayoutParams()).getMarginEnd() + uVar.getMeasuredWidth();
        } else {
            i = 0;
        }
        return this.s.getPaddingStart() + getPaddingStart() + i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.google.android.material.internal.CheckableImageButton, q.u] */
    public final void b(Drawable drawable) {
        CheckableImageButton r0 = this.u;
        r0.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.v;
            PorterDuff.Mode mode = this.w;
            TextInputLayout textInputLayout = this.r;
            sy.n.c(textInputLayout, (CheckableImageButton) r0, colorStateList, mode);
            c(true);
            sy.n.y(textInputLayout, (CheckableImageButton) r0, this.v);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.z;
        r0.setOnClickListener(null);
        sy.n.A((CheckableImageButton) r0, onLongClickListener);
        this.z = null;
        r0.setOnLongClickListener(null);
        sy.n.A((CheckableImageButton) r0, (View.OnLongClickListener) null);
        if (r0.getContentDescription() != null) {
            r0.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        q.u uVar = this.u;
        if ((uVar.getVisibility() == 0) != z) {
            uVar.setVisibility(z ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        EditText editText = this.r.v;
        if (editText == null) {
            return;
        }
        this.s.setPaddingRelative(this.u.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(2131166053), editText.getCompoundPaddingBottom());
    }

    public final void e() {
        int i = (this.t == null || this.A) ? 8 : 0;
        setVisibility((this.u.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.s.setVisibility(i);
        this.r.s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }

    public Object o(Object p1, Object p2) { return null; }
}
