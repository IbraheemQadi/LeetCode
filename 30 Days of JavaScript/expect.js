// 2704. To Be Or Not To Be
let expect = function (val1) {
  return {
    toBe(val2) {
      if (val1 !== val2) throw new Error("Not Equal");
      return true;
    },
    notToBe(val2) {
      if (val1 === val2) throw new Error("Equal");
      return true;
    },
  };
};
