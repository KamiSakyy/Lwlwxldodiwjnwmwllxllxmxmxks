package b5;

import a5.k0;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f3484a;

    /* renamed from: b, reason: collision with root package name */
    public int f3485b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f3486c = -1;

    public f(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3484a = accessibilityNodeInfo;
    }

    public static String d(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public final void a(int i) {
        this.f3484a.addAction(i);
    }

    public final void b(b bVar) {
        this.f3484a.addAction((AccessibilityNodeInfo.AccessibilityAction) bVar.f3478a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3484a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final boolean e(int i) {
        Bundle extras = this.f3484a.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f3484a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f3484a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f3486c == fVar.f3486c && this.f3485b == fVar.f3485b;
    }

    public final void f(Rect rect) {
        this.f3484a.getBoundsInParent(rect);
    }

    public final CharSequence g() {
        boolean isEmpty = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3484a;
        if (isEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList c12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList c13 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < c10.size(); i++) {
            spannableString.setSpan(new a(((Integer) c13.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c10.get(i)).intValue(), ((Integer) c11.get(i)).intValue(), ((Integer) c12.get(i)).intValue());
        }
        return spannableString;
    }

    public final boolean h() {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3484a;
        if (i >= 28) {
            return accessibilityNodeInfo.isHeading();
        }
        if (e(2)) {
            return true;
        }
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        e eVar = collectionItemInfo != null ? new e(1, collectionItemInfo) : null;
        return eVar != null && ((AccessibilityNodeInfo.CollectionItemInfo) eVar.f3483b).isHeading();
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3484a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(int i, boolean z10) {
        Bundle extras = this.f3484a.getExtras();
        if (extras != null) {
            int i10 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z10) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i10);
        }
    }

    public final void j(CharSequence charSequence) {
        this.f3484a.setClassName(charSequence);
    }

    public final void k(e eVar) {
        this.f3484a.setCollectionInfo(eVar == null ? null : (AccessibilityNodeInfo.CollectionInfo) eVar.f3483b);
    }

    public final void l(e eVar) {
        this.f3484a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) eVar.f3483b);
    }

    public final void m(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3484a.setHeading(z10);
        } else {
            i(2, z10);
        }
    }

    public final void n(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3484a;
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public final void o(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3484a.setScreenReaderFocusable(z10);
        } else {
            i(1, z10);
        }
    }

    public final void p(boolean z10) {
        this.f3484a.setScrollable(z10);
    }

    public final void q(CharSequence charSequence) {
        this.f3484a.setText(charSequence);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        f(rect);
        sb2.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3484a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            k0.e(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(accessibilityNodeInfo.getPackageName());
        sb2.append("; className: ");
        sb2.append(accessibilityNodeInfo.getClassName());
        sb2.append("; text: ");
        sb2.append(g());
        sb2.append("; error: ");
        sb2.append(accessibilityNodeInfo.getError());
        sb2.append("; maxTextLength: ");
        sb2.append(accessibilityNodeInfo.getMaxTextLength());
        sb2.append("; stateDescription: ");
        sb2.append(i >= 30 ? a5.m.b(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb2.append("; contentDescription: ");
        sb2.append(accessibilityNodeInfo.getContentDescription());
        sb2.append("; supplementalDescription: ");
        sb2.append(i >= 36 ? d.d(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb2.append("; tooltipText: ");
        sb2.append(i >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb2.append("; viewIdResName: ");
        sb2.append(accessibilityNodeInfo.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        sb2.append(i >= 33 ? c.c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb2.append("; checkable: ");
        sb2.append(accessibilityNodeInfo.isCheckable());
        sb2.append("; checked: ");
        int b10 = i >= 36 ? d.b(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        String str = "PARTIAL";
        sb2.append(b10 == 1 ? "TRUE" : b10 == 2 ? "PARTIAL" : "FALSE");
        sb2.append("; fieldRequired: ");
        sb2.append(i >= 36 ? d.e(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb2.append("; focusable: ");
        sb2.append(accessibilityNodeInfo.isFocusable());
        sb2.append("; focused: ");
        sb2.append(accessibilityNodeInfo.isFocused());
        sb2.append("; selected: ");
        sb2.append(accessibilityNodeInfo.isSelected());
        sb2.append("; clickable: ");
        sb2.append(accessibilityNodeInfo.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(accessibilityNodeInfo.isLongClickable());
        sb2.append("; contextClickable: ");
        sb2.append(accessibilityNodeInfo.isContextClickable());
        sb2.append("; expandedState: ");
        int c10 = i >= 36 ? d.c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (c10 == 0) {
            str = "UNDEFINED";
        } else if (c10 == 1) {
            str = "COLLAPSED";
        } else if (c10 != 2) {
            str = c10 != 3 ? "UNKNOWN" : "FULL";
        }
        sb2.append(str);
        sb2.append("; enabled: ");
        sb2.append(accessibilityNodeInfo.isEnabled());
        sb2.append("; password: ");
        sb2.append(accessibilityNodeInfo.isPassword());
        sb2.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb2.append("; containerTitle: ");
        sb2.append(i >= 34 ? k0.f(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb2.append("; granularScrollingSupported: ");
        sb2.append(e(67108864));
        sb2.append("; importantForAccessibility: ");
        sb2.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb2.append("; visible: ");
        sb2.append(accessibilityNodeInfo.isVisibleToUser());
        sb2.append("; isTextSelectable: ");
        sb2.append(i >= 33 ? c.e(accessibilityNodeInfo) : e(8388608));
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(i >= 34 ? k0.i(accessibilityNodeInfo) : e(64));
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new b(actionList.get(i10), 0, null, null, null));
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            b bVar = (b) arrayList.get(i11);
            int a10 = bVar.a();
            Object obj = bVar.f3478a;
            String d10 = d(a10);
            if (d10.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d10 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
            sb2.append(d10);
            if (i11 != arrayList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class b<T1,T2,T3,T4> {
        public b() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e<T1,T2,T3,T4> {
        public e() {
        }
    }
}
