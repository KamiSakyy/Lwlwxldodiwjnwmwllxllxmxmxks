package y31;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p {
    public ColorStateList A;
    public Typeface B;
    public final int a;
    public final int b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final Context g;
    public final TextInputLayout h;
    public LinearLayout i;
    public int j;
    public FrameLayout k;
    public AnimatorSet l;
    public final float m;
    public int n;
    public int o;
    public CharSequence p;
    public boolean q;
    public AppCompatTextView r;
    public CharSequence s;
    public int t;
    public int u;
    public ColorStateList v;
    public CharSequence w;
    public boolean x;
    public AppCompatTextView y;
    public int z;

    public p(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(2131165374);
        this.a = k41.b.J(2130969544, 217, context);
        this.b = k41.b.J(2130969540, 167, context);
        this.c = k41.b.J(2130969544, 167, context);
        this.d = k41.b.K(context, 2130969549, y21.a.d);
        LinearInterpolator linearInterpolator = y21.a.a;
        this.e = k41.b.K(context, 2130969549, linearInterpolator);
        this.f = k41.b.K(context, 2130969552, linearInterpolator);
    }

    public final void a(AppCompatTextView appCompatTextView, int i) {
        if (this.i == null && this.k == null) {
            Context context = this.g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.k = new FrameLayout(context);
            this.i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.k.setVisibility(0);
            this.k.addView(appCompatTextView);
        } else {
            this.i.addView((View) appCompatTextView, (ViewGroup.LayoutParams) new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.g;
                boolean d0 = i4.d0(context);
                LinearLayout linearLayout = this.i;
                int paddingStart = editText.getPaddingStart();
                if (d0) {
                    paddingStart = context.getResources().getDimensionPixelSize(2131166051);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166050);
                if (d0) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166052);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (d0) {
                    paddingEnd = context.getResources().getDimensionPixelSize(2131166051);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z, AppCompatTextView appCompatTextView, int i, int i2, int i3) {
        if (appCompatTextView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.c;
            ofFloat.setDuration(z2 ? this.b : i4);
            ofFloat.setInterpolator(z2 ? this.e : this.f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.m, 0.0f);
            ofFloat2.setDuration(this.a);
            ofFloat2.setInterpolator(this.d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.r;
        }
        if (i != 2) {
            return null;
        }
        return this.y;
    }

    public final void f() {
        this.p = null;
        c();
        if (this.n == 1) {
            if (!this.x || TextUtils.isEmpty(this.w)) {
                this.o = 0;
            } else {
                this.o = 2;
            }
        }
        i(this.n, this.o, h(this.r, ""));
    }

    public final void g(AppCompatTextView appCompatTextView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.k) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i2 = this.j - 1;
        this.j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.o == this.n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, int i2, boolean z) {
        TextView e;
        TextView e2;
        p pVar = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            pVar.l = animatorSet;
            ArrayList arrayList = new ArrayList();
            pVar.d(arrayList, pVar.x, pVar.y, 2, i, i2);
            pVar.d(arrayList, pVar.q, pVar.r, 1, i, i2);
            int size = arrayList.size();
            long j = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                j = Math.max(j, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            n nVar = new n(this, i2, e(i), i, pVar.e(i2));
            pVar = this;
            animatorSet.addListener(nVar);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (e2 = pVar.e(i2)) != null) {
                e2.setVisibility(0);
                e2.setAlpha(1.0f);
            }
            if (i != 0 && (e = e(i)) != null) {
                e.setVisibility(4);
                if (i == 1) {
                    e.setText((CharSequence) null);
                }
            }
            pVar.n = i2;
        }
        TextInputLayout textInputLayout = pVar.h;
        textInputLayout.t();
        textInputLayout.w(z, false);
        textInputLayout.z();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class AppCompatTextView<T1,T2,T3,T4> {
        public AppCompatTextView() {
        }
    }
}
