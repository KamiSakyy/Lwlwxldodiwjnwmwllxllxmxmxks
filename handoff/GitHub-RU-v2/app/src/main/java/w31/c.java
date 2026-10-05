package w31;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            i iVar = (i) message.obj;
            int i3 = message.arg1;
            h hVar = iVar.i;
            AccessibilityManager accessibilityManager = iVar.v;
            if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || hVar.getVisibility() != 0) {
                iVar.f();
                return true;
            }
            if (hVar.getAnimationMode() == 1) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.setInterpolator(iVar.d);
                ofFloat.addUpdateListener(new b(iVar, 0));
                ofFloat.setDuration(iVar.b);
                ofFloat.addListener(new a(iVar, i3, 0));
                ofFloat.start();
                return true;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            h hVar2 = iVar.i;
            int height = hVar2.getHeight();
            ViewGroup.LayoutParams layoutParams = hVar2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
            valueAnimator.setIntValues(0, height);
            valueAnimator.setInterpolator(iVar.e);
            valueAnimator.setDuration(iVar.c);
            valueAnimator.addListener(new a(iVar, i3, 2));
            valueAnimator.addUpdateListener(new b(iVar, 3));
            valueAnimator.start();
            return true;
        }
        i iVar2 = (i) message.obj;
        h hVar3 = iVar2.i;
        ViewGroup viewGroup = iVar2.g;
        if (hVar3.getParent() == null) {
            l4.e layoutParams2 = hVar3.getLayoutParams();
            if (layoutParams2 instanceof l4.e) {
                l4.e eVar = layoutParams2;
                BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                s21.a aVar = baseTransientBottomBar$Behavior.i;
                aVar.getClass();
                aVar.s = iVar2.w;
                baseTransientBottomBar$Behavior.b = new e(iVar2);
                eVar.b(baseTransientBottomBar$Behavior);
                if (iVar2.c() == null) {
                    eVar.g = 80;
                }
            }
            hVar3.B = true;
            viewGroup.addView(hVar3);
            hVar3.B = false;
            if (iVar2.c() != null) {
                int[] iArr = new int[2];
                iVar2.c().getLocationOnScreen(iArr);
                int i4 = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                i2 = (viewGroup.getHeight() + iArr2[1]) - i4;
            }
            iVar2.r = i2;
            iVar2.j();
            hVar3.setVisibility(4);
        }
        if (hVar3.isLaidOut()) {
            iVar2.i();
            return true;
        }
        iVar2.u = true;
        return true;
    }
}
