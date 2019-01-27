
const obj = {
	name: 'Julie',
	greetingBackward: function() {
		const getReverseName = () => {
			let nameBackward = '';
			for (let i=this.name.length-1; i>0; i--) { // 可以通过this访问到obj的name
				nameBackward += this.name[i];
			}
			return nameBackward;
		}
		return '${getReverseName()} si eman ym';
	}
};

obj.greetingBackward();