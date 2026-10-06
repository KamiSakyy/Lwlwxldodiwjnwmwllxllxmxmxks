package jg;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import com.github.rudroid.shortcuts.activities.ShortcutsOverviewFragment;
import com.github.rudroid.shortcuts.d0;
import ic.me;
import k71.k;

@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: /home/user/work/p/classes3.dex */
public final class e extends f {
    public static final /* synthetic */ int x = 0;
    public d0 v;
    public a w;

    public interface a {
        void a2(wm.b bVar);

        void h3(wm.b bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(me meVar, final ShortcutsOverviewFragment shortcutsOverviewFragment, d0 d0Var, ShortcutsOverviewFragment shortcutsOverviewFragment2) {
        super(meVar);
        k.g(shortcutsOverviewFragment, "reorderListener");
        k.g(shortcutsOverviewFragment2, "callback");
        this.v = d0Var;
        this.w = shortcutsOverviewFragment2;
        final int i = 0;
        View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: jg.b
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                int i3 = i;
                wc.d dVar = this;
                switch (i3) {
                    case 0:
                        e eVar = (e) dVar;
                        d0 d0Var2 = eVar.v;
                        int i4 = e.x;
                        if (keyEvent.getAction() == 0 && keyEvent.isShiftPressed()) {
                            if (i2 == 19) {
                                d0Var2.a(eVar.h(), eVar.h() - 1);
                                break;
                            } else if (i2 == 20) {
                                d0Var2.a(eVar.h(), eVar.h() + 1);
                                break;
                            }
                        }
                        break;
                    default:
                        wc.d dVar2 = dVar;
                        uc.a aVar = dVar2.w;
                        int i5 = wc.d.y;
                        if (keyEvent.getAction() == 0 && keyEvent.isShiftPressed()) {
                            if (i2 == 19) {
                                aVar.a(dVar2.h(), dVar2.h() - 1);
                                break;
                            } else if (i2 == 20) {
                                aVar.a(dVar2.h(), dVar2.h() + 1);
                                break;
                            }
                        }
                        break;
                }
                return false;
            }
        };
        ImageButton imageButton = meVar.O;
        imageButton.setOnTouchListener(new View.OnTouchListener() { // from class: jg.c
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i2 = e.x;
                if (motionEvent.getActionMasked() != 0) {
                    return false;
                }
                shortcutsOverviewFragment.H0(this);
                return false;
            }
        });
        ic.a aVar = meVar.T;
        final int i2 = 0;
        aVar.O.setOnClickListener(new View.OnClickListener(this) { // from class: jg.d
            public final /* synthetic */ e s;

            {
                this.s = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        e eVar = this.s;
                        eVar.v.a(eVar.h(), eVar.h() - 1);
                        break;
                    default:
                        e eVar2 = this.s;
                        eVar2.v.a(eVar2.h(), eVar2.h() + 1);
                        break;
                }
            }
        });
        final int i3 = 1;
        aVar.N.setOnClickListener(new View.OnClickListener(this) { // from class: jg.d
            public final /* synthetic */ e s;

            {
                this.s = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        e eVar = this.s;
                        eVar.v.a(eVar.h(), eVar.h() - 1);
                        break;
                    default:
                        e eVar2 = this.s;
                        eVar2.v.a(eVar2.h(), eVar2.h() + 1);
                        break;
                }
            }
        });
        imageButton.setOnKeyListener(onKeyListener);
    }

}
