/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
// 2635. Apply Transform Over Each Element in Array
var map = function(arr, fn) {
    let ret=[];
    for(let i=0 ; i< arr.length ; i++)
        ret[i]=fn(arr[i], i);
    return ret;
};