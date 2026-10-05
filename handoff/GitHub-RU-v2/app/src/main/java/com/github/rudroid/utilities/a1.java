package com.github.rudroid.utilities;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a1 implements td.b {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a4, code lost:
    
        if (r7.equals("merged") == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable a(Context context, td.a aVar) {
        Integer num;
        String str;
        k71.k.g(context, "context");
        String str2 = aVar.a;
        switch (str2.hashCode()) {
            case -1669041335:
                if (str2.equals("octicon-git-merge")) {
                    num = 2131231285;
                    break;
                }
                num = null;
                break;
            case -839280492:
                if (str2.equals("octicon-issue-closed")) {
                    num = 2131231322;
                    break;
                }
                num = null;
                break;
            case -642666108:
                if (str2.equals("octicon-issue-reopened")) {
                    num = 2131231330;
                    break;
                }
                num = null;
                break;
            case -492339311:
                if (str2.equals("octicon-issue-opened")) {
                    num = 2131231327;
                    break;
                }
                num = null;
                break;
            case -429606186:
                if (str2.equals("octicon-git-pull-request")) {
                    num = 2131231290;
                    break;
                }
                num = null;
                break;
            case 1824041226:
                if (str2.equals("octicon-comment-discussion")) {
                    num = 2131231201;
                    break;
                }
                num = null;
                break;
            default:
                num = null;
                break;
        }
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        String str3 = aVar.b;
        int i = 2131100990;
        switch (str3.hashCode()) {
            case -1357520532:
                if (str3.equals("closed")) {
                    if (!str2.equals("octicon-issue-closed")) {
                        i = 2131100991;
                        break;
                    }
                }
                i = 2131099948;
                break;
            case -1084122365:
                str = "text-gray";
                str3.equals(str);
                i = 2131099948;
                break;
            case -1077615828:
                break;
            case 3417674:
                if (str3.equals("open")) {
                    i = 2131100988;
                    break;
                }
                i = 2131099948;
                break;
            case 95844769:
                str = "draft";
                str3.equals(str);
                i = 2131099948;
                break;
            case 729034878:
                str = "color-text-secondary";
                str3.equals(str);
                i = 2131099948;
                break;
            default:
                i = 2131099948;
                break;
        }
        return q.e(intValue, i, context);
    }
}
