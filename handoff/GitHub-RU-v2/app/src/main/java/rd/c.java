package rd;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import java.util.concurrent.CancellationException;
import k71.k;
import s9.h;
import v71.r;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f31364r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f31365s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f31366t;

    public c(d dVar, ViewTreeObserver viewTreeObserver, r rVar) {
        this.f31364r = dVar;
        this.f31365s = viewTreeObserver;
        this.f31366t = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005a  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        int i;
        int i10;
        int i11;
        h hVar;
        TextView textView = this.f31364r.f31367r;
        int i12 = 0;
        if (textView.getLayoutParams().width == -1) {
            ViewParent parent = textView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                i = viewGroup.getPaddingEnd();
                if (textView.getLayoutParams().width == -1) {
                    ViewParent parent2 = textView.getParent();
                    ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    if (viewGroup2 != null) {
                        i10 = viewGroup2.getPaddingStart();
                        if (textView.getLayoutParams().width == -1) {
                            ViewParent parent3 = textView.getParent();
                            ViewGroup viewGroup3 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                            if (viewGroup3 != null) {
                                i12 = viewGroup3.getWidth();
                            }
                        } else {
                            i12 = textView.getContext().getResources().getDisplayMetrics().widthPixels;
                        }
                        int i13 = (i12 - i) - i10;
                        int width = textView.getWidth();
                        int paddingRight = textView.getPaddingRight() + textView.getPaddingLeft();
                        i11 = i13 - paddingRight;
                        if (i11 <= 0 && (i11 = width - paddingRight) <= 0) {
                            i11 = -1;
                        }
                        if (i11 > 0) {
                            int paddingBottom = Integer.MAX_VALUE - (textView.getPaddingBottom() + textView.getPaddingTop());
                            int i14 = (paddingBottom > 0 || paddingBottom > 0) ? paddingBottom : -1;
                            if (i14 > 0) {
                                hVar = new h(new s9.a(i11), new s9.a(i14));
                                r rVar = this.f31366t;
                                if (hVar != null) {
                                    rVar.m((CancellationException) null);
                                    return true;
                                }
                                ViewTreeObserver viewTreeObserver = this.f31365s;
                                k.d(viewTreeObserver);
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(this);
                                } else {
                                    textView.getViewTreeObserver().removeOnPreDrawListener(this);
                                }
                                rVar.X(hVar);
                                return true;
                            }
                        }
                        hVar = null;
                        r rVar2 = this.f31366t;
                        if (hVar != null) {
                        }
                    }
                }
                i10 = 0;
                if (textView.getLayoutParams().width == -1) {
                }
                int i132 = (i12 - i) - i10;
                int width2 = textView.getWidth();
                int paddingRight2 = textView.getPaddingRight() + textView.getPaddingLeft();
                i11 = i132 - paddingRight2;
                if (i11 <= 0) {
                    i11 = -1;
                }
                if (i11 > 0) {
                }
                hVar = null;
                r rVar22 = this.f31366t;
                if (hVar != null) {
                }
            }
        }
        i = 0;
        if (textView.getLayoutParams().width == -1) {
        }
        i10 = 0;
        if (textView.getLayoutParams().width == -1) {
        }
        int i1322 = (i12 - i) - i10;
        int width22 = textView.getWidth();
        int paddingRight22 = textView.getPaddingRight() + textView.getPaddingLeft();
        i11 = i1322 - paddingRight22;
        if (i11 <= 0) {
        }
        if (i11 > 0) {
        }
        hVar = null;
        r rVar222 = this.f31366t;
        if (hVar != null) {
        }
    }
}
