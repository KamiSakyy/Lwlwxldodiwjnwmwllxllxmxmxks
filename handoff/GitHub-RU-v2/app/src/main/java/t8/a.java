package t8;

import a5.l;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import k71.k;
import p8.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements b, d, f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f32147c = new a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final a f32148d = new a(1);

    /* renamed from: e, reason: collision with root package name */
    public static final a f32149e = new a(2);

    /* renamed from: f, reason: collision with root package name */
    public static final a f32150f = new a(3);

    /* renamed from: g, reason: collision with root package name */
    public static final a f32151g = new a(4);

    /* renamed from: h, reason: collision with root package name */
    public static final a f32152h = new a(5);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32153b;

    public /* synthetic */ a(int i) {
        this.f32153b = i;
    }

    public static b e() {
        int i = Build.VERSION.SDK_INT;
        return i >= 30 ? c.f32155b : i >= 29 ? f32150f : i >= 28 ? f32149e : f32148d;
    }

    @Override // t8.b
    public Rect a(Activity activity) {
        DisplayCutout a10;
        switch (this.f32153b) {
            case 1:
                Rect rect = new Rect();
                Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
                defaultDisplay.getRectSize(rect);
                if (!activity.isInMultiWindowMode()) {
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Resources resources = activity.getResources();
                    int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    int i = rect.bottom + dimensionPixelSize;
                    if (i == point.y) {
                        rect.bottom = i;
                    } else {
                        int i10 = rect.right + dimensionPixelSize;
                        if (i10 == point.x) {
                            rect.right = i10;
                        }
                    }
                }
                return rect;
            case 2:
                Rect rect2 = new Rect();
                Configuration configuration = activity.getResources().getConfiguration();
                try {
                    Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(configuration);
                    if (activity.isInMultiWindowMode()) {
                        Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                        k.e(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                        rect2.set((Rect) invoke);
                    } else {
                        Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                        k.e(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                        rect2.set((Rect) invoke2);
                    }
                } catch (Exception e5) {
                    if (!(e5 instanceof NoSuchFieldException) && !(e5 instanceof NoSuchMethodException) && !(e5 instanceof IllegalAccessException) && !(e5 instanceof InvocationTargetException)) {
                        throw e5;
                    }
                    b.f32154a.getClass();
                    activity.getWindowManager().getDefaultDisplay().getRectSize(rect2);
                }
                Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                if (!activity.isInMultiWindowMode()) {
                    Resources resources2 = activity.getResources();
                    int identifier2 = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
                    int dimensionPixelSize2 = identifier2 > 0 ? resources2.getDimensionPixelSize(identifier2) : 0;
                    int i11 = rect2.bottom + dimensionPixelSize2;
                    if (i11 == point2.y) {
                        rect2.bottom = i11;
                    } else {
                        int i12 = rect2.right + dimensionPixelSize2;
                        if (i12 == point2.x) {
                            rect2.right = i12;
                        } else if (rect2.left == dimensionPixelSize2) {
                            rect2.left = 0;
                        }
                    }
                }
                if ((rect2.width() < point2.x || rect2.height() < point2.y) && !activity.isInMultiWindowMode() && (a10 = l.a(defaultDisplay2)) != null) {
                    if (rect2.left == l.v(a10)) {
                        rect2.left = 0;
                    }
                    if (point2.x - rect2.right == l.w(a10)) {
                        rect2.right = l.w(a10) + rect2.right;
                    }
                    if (rect2.top == l.x(a10)) {
                        rect2.top = 0;
                    }
                    if (point2.y - rect2.bottom == l.u(a10)) {
                        rect2.bottom = l.u(a10) + rect2.bottom;
                    }
                }
                return rect2;
            default:
                Configuration configuration2 = activity.getResources().getConfiguration();
                try {
                    Field declaredField2 = Configuration.class.getDeclaredField("windowConfiguration");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(configuration2);
                    Object invoke3 = obj2.getClass().getDeclaredMethod("getBounds", null).invoke(obj2, null);
                    k.e(invoke3, "null cannot be cast to non-null type android.graphics.Rect");
                    return new Rect((Rect) invoke3);
                } catch (Exception e10) {
                    if (!(e10 instanceof NoSuchFieldException) && !(e10 instanceof NoSuchMethodException) && !(e10 instanceof IllegalAccessException) && !(e10 instanceof InvocationTargetException)) {
                        throw e10;
                    }
                    b.f32154a.getClass();
                    return f32149e.a(activity);
                }
        }
    }

    @Override // t8.f
    public i b(Activity activity, d dVar) {
        k.g(dVar, "densityCompatHelper");
        b.f32154a.getClass();
        return new i(new n8.b(e().a(activity)), dVar.d(activity));
    }

    @Override // t8.f
    public i c(Context context, d dVar) {
        k.g(dVar, "densityCompatHelper");
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                context2 = context;
                break;
            }
            if ((context2 instanceof Activity) || (context2 instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context2 = contextWrapper.getBaseContext();
            k.f(context2, "getBaseContext(...)");
        }
        if (context2 instanceof Activity) {
            return b((Activity) context2, dVar);
        }
        if (!(context2 instanceof InputMethodService) && !(context2 instanceof Application)) {
            throw new IllegalArgumentException("Must provide a UiContext or Application Context");
        }
        Object systemService = context.getSystemService("window");
        k.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        k.f(defaultDisplay, "getDefaultDisplay(...)");
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new i(new Rect(0, 0, point.x, point.y), dVar.d(context));
    }

    @Override // t8.d
    public float d(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}
