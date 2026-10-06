package y31;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d extends m {
    public int e;
    public int f;
    public TimeInterpolator g;
    public TimeInterpolator h;
    public EditText i;
    public a j;
    public com.github.rudroid.createissue.propertybar.projects.b k;
    public AnimatorSet l;
    public ValueAnimator m;

    public d(l lVar) {
        super(lVar);
        this.j = new a(this, 0);
        this.k = new com.github.rudroid.createissue.propertybar.projects.b(1, this);
        this.e = k41.b.J(2130969543, 100, lVar.getContext());
        this.f = k41.b.J(2130969543, 150, lVar.getContext());
        this.g = k41.b.K(lVar.getContext(), 2130969552, y21.a.a);
        this.h = k41.b.K(lVar.getContext(), 2130969550, y21.a.d);
    }

    @Override // y31.m
    public final void a() {
        if (this.b.G != null) {
            return;
        }
        s(t());
    }

    @Override // y31.m
    public final int c() {
        return 2131951897;
    }

    @Override // y31.m
    public final int d() {
        return 2131231581;
    }

    @Override // y31.m
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // y31.m
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // y31.m
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // y31.m
    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(t());
    }

    @Override // y31.m
    public final void o(boolean z) {
        if (this.b.G == null) {
            return;
        }
        s(z);
    }

    @Override // y31.m
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.h);
        ofFloat.setDuration(this.f);
        final int i = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: y31.b
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        d dVar = this.b;
                        dVar.getClass();
                        dVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        q.u uVar = dVar2.d;
                        uVar.setScaleX(floatValue);
                        uVar.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        ofFloat2.setDuration(i2);
        final int i3 = 0;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: y31.b
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        d dVar = this.b;
                        dVar.getClass();
                        dVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        q.u uVar = dVar2.d;
                        uVar.setScaleX(floatValue);
                        uVar.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.l.addListener(new c(this, i3));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i2);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: y31.b
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        d dVar = this.b;
                        dVar.getClass();
                        dVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.b;
                        dVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        q.u uVar = dVar2.d;
                        uVar.setScaleX(floatValue);
                        uVar.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.m = ofFloat3;
        ofFloat3.addListener(new c(this, i));
    }

    @Override // y31.m
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new y1.a(1, this));
        }
    }

    public final void s(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
