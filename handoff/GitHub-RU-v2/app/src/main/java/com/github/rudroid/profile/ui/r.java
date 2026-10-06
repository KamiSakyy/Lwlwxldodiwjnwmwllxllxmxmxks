package com.github.rudroid.profile.ui;

import com.github.rudroid.profile.d;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.organizations.OrganizationNameAndAvatarUrl;
import com.github.service.models.response.type.SocialLinkService;
import java.time.ZonedDateTime;
import yz0.h8;
import yz0.n8;
import yz0.o8;

/* loaded from: /home/user/work/p/classes.dex */
final class r {
    static {
        new d.b(new Avatar("https://avatars.githubusercontent.com/u/1?v=4", Avatar.Type.User), "Name", "login", "email", "websiteUrl", "bioHtml", "companyHtml", new o8("emojiHtml", ":shipit:", false, "octocorp", (OrganizationNameAndAvatarUrl) null, (String) null, ZonedDateTime.now()), "location", 34, 43, false, true, true, true, "userId", true, true, true, false, "xUsername", x61.l.r(new n8[]{new n8("", SocialLinkService.LINKEDIN, "LinkedIn"), new n8("", SocialLinkService.MASTODON, "Mastodon")}), sy.d0Shadow.n(new h8("achievableSlug", "title", "badgeImageUrl")), "pronouns", true, false, true);
    }
}
