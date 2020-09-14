import { FuseNavigation } from '@fuse/types';

export const navigation: FuseNavigation[] = [
    {
        id       : 'applications',
        title    : 'Applications',
        translate: 'NAV.APPLICATIONS',
        type     : 'group',
        children : [
            {
                id       : 'aboutme',
                title    : 'About me',
                translate: 'NAV.ABOUTME.TITLE',
                type     : 'item',
                icon     : 'person',
                url      : '/aboutme'
            },
            {
                id       : 'activity',
                title    : 'Activity',
                translate: 'NAV.ACTIVITY.TITLE',
                type     : 'item',
                icon     : 'schedule',
                url      : '/about'
            },
            {
                id       : 'Contact me',
                title    : 'Contact',
                translate: 'NAV.CONTACT.TITLE',
                type     : 'item',
                icon     : 'email',
                url      : '/contact'
            }
        ]
    }
];
