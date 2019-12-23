// import {Injectable} from '@angular/core';
// import { CanActivate, ActivatedRouteSnapshot} from '@angular/router';

// @Injectable({
//     providedIn : 'root'
// })

// export class AuthGuard implements CanActivate{
//     canActivate(route: ActivatedRouteSnapshot): boolean {
//         const expectedRoleArray = route.data.roles;
//         const userDetails = JSON.parse(localStorage.getItem('userDetails'));
//         let expectedRole: string;
//         for(const index in expectedRoleArray){
//             if(userDetails && userDetails.role === expectedRoleArray){
//                 expectedRole = expectedRoleArray[index];
//             }
//         }
//     }
//     constructor(){
        
//     }
    
// }
