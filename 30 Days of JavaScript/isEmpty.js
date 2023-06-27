// 2727. Is Object Empty
/**
 * @param {Object | Array} obj
 * @return {boolean}
 */
// 1st solution O(1) time
// for in loop work with array and objects
var isEmpty = function (obj) {
  for (let ele in obj) return false;
  return true;
};
// 2nd solution O(n) time
var isEmpty = function (obj) {
  return Object.keys(obj).length === 0 ? true : false;
};
