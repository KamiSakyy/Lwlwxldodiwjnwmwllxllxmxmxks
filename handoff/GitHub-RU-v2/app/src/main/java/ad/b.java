package ad;

import com.github.rudroid.settings.codeoptions.f;
import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.type.DiffLineType;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f825a;

        static {
            int[] iArr = new int[DiffLineType.values().length];
            try {
                iArr[DiffLineType.ADDITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiffLineType.DELETION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DiffLineType.CONTEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DiffLineType.INJECTED_CONTEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DiffLineType.HUNK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f825a = iArr;
        }
    }

    public static final int a(DiffLineType diffLineType, f fVar, CommentLevelType commentLevelType) {
        k.g(diffLineType, "<this>");
        k.g(commentLevelType, "commentType");
        if (commentLevelType == CommentLevelType.FILE) {
            return 2131099700;
        }
        boolean a10 = rc.a.a(fVar);
        int i = a.f825a[diffLineType.ordinal()];
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? a10 ? 2131099963 : 2131099962 : i != 5 ? a10 ? 2131099963 : 2131099962 : a10 ? 2131099961 : 2131099960 : a10 ? 2131099967 : 2131099966 : a10 ? 2131099965 : 2131099964;
    }

    public static final int b(DiffLineType diffLineType, f fVar) {
        k.g(diffLineType, "<this>");
        boolean a10 = rc.a.a(fVar);
        int i = a.f825a[diffLineType.ordinal()];
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? a10 ? 2131231523 : 2131231522 : i != 5 ? a10 ? 2131231523 : 2131231522 : a10 ? 2131231521 : 2131231520 : a10 ? 2131231527 : 2131231526 : a10 ? 2131231525 : 2131231524;
    }

    public static final int c(DiffLineType diffLineType, f fVar) {
        k.g(diffLineType, "<this>");
        boolean a10 = rc.a.a(fVar);
        int i = a.f825a[diffLineType.ordinal()];
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? a10 ? 2131099986 : 2131099985 : i != 5 ? a10 ? 2131099986 : 2131099985 : a10 ? 2131099984 : 2131099983 : a10 ? 2131099990 : 2131099989 : a10 ? 2131099988 : 2131099987;
    }
}
