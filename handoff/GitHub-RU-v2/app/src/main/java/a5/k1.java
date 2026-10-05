package a5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class k1 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f437b;

    public /* synthetic */ k1(int i, Object obj) {
        this.f436a = i;
        this.f437b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f436a) {
            case k5.f.J /* 0 */:
                ((m1) this.f437b).a();
                break;
            case 7:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f437b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.A = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f436a) {
            case k5.f.J /* 0 */:
                ((m1) this.f437b).c();
                break;
            case 1:
                ((HideBottomViewOnScrollBehavior) this.f437b).k = null;
                break;
            case 2:
                ((HideViewOnScrollBehavior) this.f437b).k = null;
                break;
            case 3:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f437b;
                bottomSheetBehavior.J(5);
                WeakReference weakReference = bottomSheetBehavior.X;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.X.get()).requestLayout();
                    break;
                }
                break;
            case 4:
                ((d8.o) this.f437b).n();
                animator.removeListener(this);
                break;
            case 5:
                e8.f fVar = (e8.f) this.f437b;
                ArrayList arrayList = new ArrayList(fVar.f22074v);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((h31.a) arrayList.get(i)).a(fVar);
                }
                break;
            case 6:
                p31.f fVar2 = (p31.f) this.f437b;
                ((p31.a) fVar2).b.setTranslationY(0.0f);
                fVar2.b(0.0f);
                break;
            case 7:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f437b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.A = false;
                break;
            case 8:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f437b;
                sideSheetBehavior.x(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    break;
                }
                break;
            default:
                y31.i iVar = (y31.i) this.f437b;
                iVar.p();
                iVar.r.start();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f436a) {
            case k5.f.J /* 0 */:
                ((m1) this.f437b).b();
                break;
            case 5:
                e8.f fVar = (e8.f) this.f437b;
                ArrayList arrayList = new ArrayList(fVar.f22074v);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((h31.a) arrayList.get(i)).b(fVar);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public k1(m1 m1Var, View view) {
        this.f436a = 0;
        this.f437b = m1Var;
    }
}
